package com.rookie.bigdata;

import io.reactivex.*;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Class RxjavaTest
 * @Description https://juejin.cn/post/6844903957496643597
 * @Author rookie
 * @Date 2024/5/27 10:34
 * @Version 1.0
 */
public class RxjavaTest {


    /**
     * onNext()：当被观察者(observable)通过调用onNext()发射数据的时候，观察者(observer)调用onNext()接收数据
     * onError()：当被观察者(observable)调用该函数时，观察者(observer)调用onError()，其他事件将不会继续发送
     * onComplete()：当被观察者(observable)调用该函数时，观察者(observer)调用onComplete()，其他事件将不会继续发送
     * <p>
     * 作者：刘洋巴金
     * 链接：https://juejin.cn/post/6844903957496643597
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Test
    public void test01() {

//        2.1 创建被观察者

        // 创建被观察者
        Observable<String> stringObservable = Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("你好呀");
                emitter.onNext("我爱中国");
                emitter.onNext("祝愿祖国繁荣富强");
                emitter.onComplete();
            }
        });

        //2.2 创建观察者
        // 创建观察者
        Observer observer = new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("lybj,准备监听");

//                Log.i("lybj", "准备监听");
            }

            @Override
            public void onNext(String s) {
                System.out.println("lybj" + s);

//                Log.i("lybj", s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("lybj,error");

//                Log.i("lybj", "error");
            }

            @Override
            public void onComplete() {

                System.out.println("lybj,监听完毕");

//                Log.i("lybj", "监听完毕");
            }
        };

        //2.3 订阅（也就是将被观察者和观察者关联）
        // 订阅
        stringObservable.subscribe(observer);


    }

    /**
     * 创建被观察者对象
     */
    @Test
    public void testCreate() {
        // 创建被观察者
        Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("你好呀");
                emitter.onNext("我爱中国");
                emitter.onNext("祝愿祖国繁荣富强");
                emitter.onComplete();
            }
        }).subscribe(new Observer<String>() { // 关联观察者

            @Override
            public void onSubscribe(Disposable d) {

                System.out.println("lybj,准备监听");
//                Log.i("lybj", "准备监听");
            }

            @Override
            public void onNext(String s) {
                System.out.println("lybj" + s);

//                Log.i("lybj", s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("lybj,error");

//                Log.i("lybj", "error");
            }

            @Override
            public void onComplete() {

                System.out.println("lybj,监听完毕");


//                Log.i("lybj", "监听完毕");
            }
        });

    }


    /**
     * 通过上面的图，应该很形象的说明了，主要作用就是创建一个被观察者，并发送事件，但是发送的事件不可以超过10个以上
     */
    @Test
    public void testJust() {
        Observable.just("小明", "小红", "小兰").subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

                System.out.println("准备监听");
//                Log.i("lybj", "准备监听");
            }

            @Override
            public void onNext(String s) {

                System.out.println(s + "来了");
//                Log.i("lybj", s+"来了");
            }

            @Override
            public void onError(Throwable e) {

                System.out.println("Error");
//                Log.i("lybj", "Error");
            }

            @Override
            public void onComplete() {
                System.out.println("完毕");

//                Log.i("lybj", "完毕");
            }
        });


    }

    /**
     * 当到指定时间后就会发送一个 0 的值给观察者。 在项目中，可以做一些延时的处理，类似于Handler中的延时
     * <p>
     * 延迟2秒后，将结果发送给观察者，Consumer和Observer是创建观察者的两种写法，相当于观察者中的onNext方法。
     */
    @Test
    public void testTimer() throws Exception {
        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Consumer<Long>() {

            @Override
            public void accept(Long aLong) throws Exception {

                System.out.println("lybj," + aLong + "");
            }
        });


        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull Long aLong) {
                System.out.println("lybj," + aLong + "");
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        Thread.sleep(1000000);

    }


    /**
     * 每隔一段时间就会发送一个事件，这个事件是从0开始，不断增1的数字。 类似于项目中的timer，做计时器
     */
    @Test
    public void testInterval() throws Exception {
        Observable.interval(3, TimeUnit.SECONDS).subscribe(new Consumer<Long>() {

            @Override
            public void accept(Long aLong) throws Exception {

                System.out.println("lybj," + aLong + "");
            }
        });

        Thread.sleep(1000000);

    }

    /**
     * 可以指定发送事件的开始值和数量，其他与 interval() 的功能一样。
     * <p>
     * 参数依次是：开始值，循环执行的次数，初始延迟时间，执行间隔时间，时间单位
     *
     * @throws Exception
     */
    @Test
    public void testIntervalRange() throws Exception {
        Observable.intervalRange(100, 4, 0, 10, TimeUnit.SECONDS).subscribe(new Consumer<Long>() {

            @Override
            public void accept(Long aLong) throws Exception {

                System.out.println("lybj," + aLong + "");
            }
        });

        Thread.sleep(1000000);

    }

    /**
     * 同时发送一定范围的事件序列。
     */
    @Test
    public void testRange() throws Exception {
        Observable.range(0, 10).subscribe(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) throws Exception {

                System.out.println("lybj," + integer + "");
            }
        });

        Thread.sleep(1000000);

    }

    /**
     * 作用与 range() 一样，只是数据类型为 Long
     */
    @Test
    public void testRangeLong() throws Exception {
        Observable.rangeLong(0, 10).subscribe(new Consumer<Long>() {

            @Override
            public void accept(Long aLong) throws Exception {
                System.out.println("lybj," + aLong + "");

//                Log.i("lybj", aLong+"");
            }
        });

        Thread.sleep(1000000);

    }

    @Test
    public void testEmpty_never_error() {

//        Observable.empty().subscribe(new Observer() {

//        Observable.error(new Exception("错误")).subscribe(new Observer() {
        Observable.never().subscribe(new Observer() {

            @Override
            public void onSubscribe(Disposable d) {

//                    Log.i("lybj", "准备监听");

                System.out.println("lybj, 准备监听");

            }

            @Override
            public void onNext(Object o) {
                System.out.println("lybj " + o + "");

//                    Log.i("lybj", o+"");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("lybj onError");

//                    Log.i("lybj", "onError");
            }

            @Override
            public void onComplete() {

                System.out.println("lybj onComplete");

//                    Log.i("lybj", "onComplete");
            }
        });

    }

    //转换操作符

    /**
     * map 可以将被观察者发送的数据类型转变成其他的类型。简单来讲，就是可以对发射过来的数据进行再加工，再传给观察者
     */
    @Test
    public void testMap() {
        Observable.just("中国", "祖国", "中国军人")
                .map(new Function<String, String>() {

                    @Override
                    public String apply(String s) throws Exception {

                        return "我爱" + s;
                    }
                })
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        System.out.println("lybj, " + s);
//                        Log.i("lybj", s);
                    }
                });

    }

    /**
     * 这个方法可以将事件序列中的元素进行整合加工，返回一个新的被观察者。
     * flatMap() 其实与 map() 类似，但是 flatMap() 返回的是一个 Observerable，map()只是返回数据，如果在元素再加工的时候，想再使用上面的创建操作符的话，建议使用flatMap()，而非map()。
     * <p>
     * 作者：刘洋巴金
     * 链接：https://juejin.cn/post/6844903957496643597
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Test
    public void testFlatMap() {
        Observable.just("中国", "祖国", "中国军人", "贪官")
                .flatMap(new Function<String, ObservableSource<String>>() {

                    @Override
                    public ObservableSource<String> apply(String s) throws Exception {

                        if (s.equals("贪官")) {

                            return Observable.error(new Exception("贪官不能被喜欢"));
                        }
                        return Observable.just("我爱" + s);
                    }
                })
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        System.out.println("lybj, " + s);
//                        Log.i("lybj", s);
                    }
                }, new Consumer<Throwable>() {

                    @Override
                    public void accept(Throwable throwable) throws Exception {

                        System.out.println("lybj, " + throwable.getMessage());

//                        Log.i("lybj", throwable.getMessage());
                    }
                });

    }


    /**
     * concatMap() 和 flatMap() 基本上是一样的，只不过 concatMap() 转发出来的事件是有序的，而 flatMap() 是无序的。
     */
    @Test
    public void testConcatMap() {
        Observable.just("中国", "祖国", "中国军人", "贪官")
                .concatMap(new Function<String, ObservableSource<String>>() {

                    @Override
                    public ObservableSource<String> apply(String s) throws Exception {

                        if (s.equals("贪官")) {

                            return Observable.error(new Exception("贪官不能被喜欢"));
                        }
                        return Observable.just("我爱" + s);
                    }
                })
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println("lybj, " + s);
//                        Log.i("lybj", s);
                    }
                }, new Consumer<Throwable>() {

                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        System.out.println("lybj, " + throwable.getMessage());

//                        Log.i("lybj", throwable.getMessage());
                    }
                });

    }

    /**
     * buffer 有两个参数，一个是 count，另一个 skip。count 缓冲区元素的数量，skip 就代表缓冲区满了之后，发送下一次事件序列的时候要跳过多少元素。
     */
    @Test
    public void testBuffer() {
        Observable.just("1", "2", "3", "4", "5")
                .buffer(2, 1)
                .subscribe(new Consumer<List<String>>() {

                    @Override
                    public void accept(List<String> strings) throws Exception {

                        System.out.println("lybj" + "缓冲区大小： " + strings.size());
                        for (String s : strings) {
//                            Log.d("lybj",  s);
                            System.out.println("lybj " + s);
                        }
                    }
                });

    }

    /**
     * 将发射的数据通过一个函数进行变换，然后将变换后的结果作为参数跟下一个发射的数据一起继续通过那个函数变换，这样依次连续发射得到最终结果。
     * <p>
     * 简单来说，先将第一个元素返回给观察者，然后将1，2的和返给观察者，然后将上一次计算的和，当第一个元素，也就是3，第2个元素，是一直按顺序取值，取第3个元素也就是3，那么将，3+3 =6，返回给观察者，以此类推，将6作为第一个元素，第二个元素取值4，将6+4=10返回给观察者。
     * sacn操作符是遍历源Observable产生的结果，再按照自定义规则进行运算，依次输出每次计算后的结果给订阅者
     * <p>
     * 作者：刘洋巴金
     * 链接：https://juejin.cn/post/6844903957496643597
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Test
    public void testScan() {
        Observable.just(1, 2, 3, 4, 5)
                .scan(new BiFunction<Integer, Integer, Integer>() {

                    @Override
                    public Integer apply(Integer integer, Integer integer2) throws Exception {

                        System.out.println("lybj " + "integer01: " + integer + " integer02: " + integer2);
                        return integer + integer2;
                    }
                }).subscribe(new Consumer<Integer>() {

                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj " + "accept: " + integer);
//                        Log.i("lybj", "accept: " + integer);
                    }
                });

    }

    /**
     * 发送事件时，将这些事件分为按数量重新分组。window 中的 count 的参数就是代表指定的数量，例如将 count 指定为2，那么每发2个数据就会将这2个数据分成一组。
     * window与buffer区别：window是把数据分割成了Observable，buffer是把数据分割成List
     * <p>
     * 作者：刘洋巴金
     * 链接：https://juejin.cn/post/6844903957496643597
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Test
    public void testWindows() {
        Observable.just("鲁班", "孙尚香", "亚索", "火女", "盖伦")
                .window(2)
                .subscribe(new Consumer<Observable<String>>() {

                    @Override
                    public void accept(Observable<String> stringObservable) throws Exception {

                        System.out.println("lybj " + "分组开始");
                        stringObservable.subscribe(new Consumer<String>() {

                            @Override
                            public void accept(String s) throws Exception {

                                System.out.println("lybj " + s);
//                                Log.i("lybj", s);
                            }
                        });
                    }
                });

    }


    //6.组合操作符


    /**
     * 可以将多个观察者组合在一起，然后按照之前发送顺序发送事件。需要注意的是，concat() 最多只可以发送4个事件。
     */
    @Test
    public void testConcat() {


        Observable.concat(
                        Observable.just(1, 2, 3),
                        Observable.just(4, 5),
                        Observable.just(6, 7),
                        Observable.just(8, 9))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj " + integer + "");
                    }
                });
    }


    /**
     * 与 concat() 作用一样，不过 concatArray() 可以发送多于 4 个被观察者。
     */
    @Test
    public void testConcatArray() {
        Observable.concatArray(Observable.just(1, 2, 3, 4),
                        Observable.just(5, 6),
                        Observable.just(7, 8, 9, 10),
                        Observable.just(11, 12, 13),
                        Observable.just(14, 15),
                        Observable.just(16))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj " + integer + "");
                    }
                });

    }


    /**
     * 这个方法与 concat() 作用基本一样，但是 concat() 是串行发送事件，而 merge() 并行发送事件，也是只能发送4个。
     */
    @Test
    public void testMerge() {
        Observable.merge(Observable.just(1, 2, 3, 4),
                        Observable.just(5, 6),
                        Observable.just(7, 8, 9, 10),
                        Observable.just(11, 12, 13))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj " + integer + "");
                    }
                });

    }


    /**
     * zip操作符用于将多个数据源合并，并生成一个新的数据源。新生成的数据源严格按照合并前的数据源的数据发射顺序，并且新数据源的数据个数等于合并前发射数据个数最少的那个数据源的数据个数。
     */
    @Test
    public void testZip() {
        Observable.zip(Observable.just(1, 2, 3),
                        Observable.just("A", "B", "C", "D", "E"),
                        new BiFunction<Integer, String, String>() {

                            @Override
                            public String apply(Integer o1, String o2) throws Exception {

                                return o1 + "_" + o2;
                            }
                        })
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String o) throws Exception {

                        System.out.println("lybj " + o + "");
                    }
                });

    }

    /**
     * 在发送事件之前追加事件，startWith() 追加一个事件，startWithArray() 可以追加多个事件。追加的事件会先发出。
     */
    @Test
    public void testStartWith() {
        Observable.just(1, 2, 3)
                .startWithArray(4, 5)
                .subscribe(new Consumer<Integer>() {

                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj " + integer + "");
                    }
                });

    }

    /**
     * 返回被观察者发送事件的数量。
     */
    @Test
    public void testCount() {
        Observable.just(2, 3, 4, 5, 6)
                .count()
                .subscribe(new Consumer<Long>() {

                    @Override
                    public void accept(Long aLong) throws Exception {

                        System.out.println("lybj" + "事件数量：" + aLong);
                    }
                });

    }

    //7.功能操作符

    /**
     * 延迟一段时间发送事件。
     */
    @Test
    public void testDelay() throws Exception {
        Observable.just(1, 2, 3, 4)
                .delay(3, TimeUnit.SECONDS)
                .subscribe(new Consumer<Integer>() {

                    @Override
                    public void accept(Integer integer) throws Exception {

                        System.out.println("lybj" + integer + "");
                    }
                });

        Thread.sleep(100000);

    }


    /**
     * 2.1 做啥的？
     * doOnEach(): 每次发送事件之前都会回调这个方法
     * doOnNext(): Observable 每发送 onNext() 之前都会先回调这个方法。
     * doAfterNext(): Observable 每发送 onNext() 之后都会回调这个方法。
     * doOnComplete(): Observable 每发送 onComplete() 之前都会回调这个方法。
     * doOnError(): Observable 每发送 onError() 之前都会回调这个方法。
     * doOnSubscribe(): Observable 每发送 onSubscribe()之前都会回调这个方法。
     * doOnDispose(): 当调用 Disposable 的 dispose() 之后回调该方法。
     * doOnTerminate(): 在 onError 或者 onComplete 发送之前回调。
     * doAfterTerminate(): onError 或者 onComplete 发送之后回调。
     * doFinally(): 在所有事件发送完毕之后回调该方法。如果取消订阅之后doAfterTerminate()就不会被回调，而doFinally()无论怎么样都会被回调，且都会在事件序列的最后。
     * <p>
     * 作者：刘洋巴金
     * 链接：https://juejin.cn/post/6844903957496643597
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    @Test
    public void testFunction() {
        Observable.create(new ObservableOnSubscribe<Integer>() {

            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {

                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        }).doOnEach(new Consumer<Notification<Integer>>() {

            @Override
            public void accept(Notification<Integer> integerNotification) throws Exception {

                System.out.println("lybj," + "doOnEach 方法执行了, 结果：" + integerNotification.getValue());
            }
        }).doOnNext(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) throws Exception {

                System.out.println("lybj" + "doOnNext 方法执行了, 结果：" + integer);
            }
        }).doAfterNext(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) throws Exception {

                System.out.println("lybj" + "doAfterNext 方法执行了, 结果：" + integer);
            }
        }).doOnComplete(new Action() {

            @Override
            public void run() throws Exception {

                System.out.println("lybj " + "doOnComplete 方法执行了");
            }
        }).doOnError(new Consumer<Throwable>() {

            @Override
            public void accept(Throwable throwable) throws Exception {

                System.out.println("lybj " + "doOnError 方法执行了");
            }
        }).doOnSubscribe(new Consumer<Disposable>() {

            @Override
            public void accept(Disposable disposable) throws Exception {

                System.out.println("lybj" + "doOnSubscribe 方法执行了");
            }
        }).doOnDispose(new Action() {

            @Override
            public void run() throws Exception {

                System.out.println("lybj" + "doOnDispose 方法执行了");
            }
        }).doOnTerminate(new Action() {

            @Override
            public void run() throws Exception {

                System.out.println("lybj" + "doOnTerminate 方法执行了");
            }
        }).doAfterTerminate(new Action() {

            @Override
            public void run() throws Exception {

                System.out.println("lybj" + "doAfterTerminate 方法执行了");
            }
        }).doFinally(new Action() {

            @Override
            public void run() throws Exception {

                System.out.println("lybj" + "doFinally 方法执行了");
            }
        }).subscribe(new Observer<Integer>() {

            private Disposable disposable;

            @Override
            public void onSubscribe(Disposable d) {

                disposable = d;
                System.out.println("lybj" + "------观察者onSubscribe()执行");
            }

            @Override
            public void onNext(Integer integer) {

                System.out.println("lybj" + "------观察者onNext()执行：" + integer);
                if (integer == 2) {
//                    disposable.dispose(); // 取消订阅
                }
            }

            @Override
            public void onError(Throwable e) {

                System.out.println("lybj" + "------观察者onError()执行");
            }

            @Override
            public void onComplete() {

                System.out.println("lybj" + "------观察者onComplete()执行");
            }
        });

    }

    /**
     * 当接受到一个 onError() 事件之后回调，返回的值会回调 onNext() 方法，并正常结束该事件序列。
     */
    @Test
    public void testOnErrorReturn() {
        Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("小明：到");
                emitter.onError(new IllegalStateException("error"));
                emitter.onNext("小方：到");
            }
        }).onErrorReturn(new Function<Throwable, String>() {

            @Override
            public String apply(Throwable throwable) throws Exception {

                System.out.println("lybj," + "小红请假了");
                return "小李：到";
            }
        }).subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(String s) {

                System.out.println("lybj " + s);
            }

            @Override
            public void onError(Throwable e) {

                System.out.println("lybj " + e.getMessage());
            }

            @Override
            public void onComplete() {
            }
        });

    }


    /**
     * 当接收到 onError() 事件时，返回一个新的 Observable，并正常结束事件序列。
     */
    @Test
    public void testOnErrorResumeNext() {
        Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("小明");
                emitter.onNext("小方");
                emitter.onNext("小红");
                emitter.onError(new NullPointerException("error"));
            }
        }).onErrorResumeNext(new Function<Throwable, ObservableSource<? extends String>>() {

            @Override
            public ObservableSource<? extends String> apply(Throwable throwable) throws Exception {

                return Observable.just("1", "2", "3");
            }
        }).subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

                System.out.println("lybj" + "准备监听");
            }

            @Override
            public void onNext(String s) {

                System.out.println("lybj" + s);
            }

            @Override
            public void onError(Throwable e) {

                System.out.println("lybj" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("lybj" + "onComplete");
            }
        });


    }

    /**
     * 与 onErrorResumeNext() 作用基本一致，但是这个方法只能捕捉 Exception。
     */
    @Test
    public void testOnExceptionResumeNext() {
        Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("小明");
                emitter.onNext("小方");
                emitter.onNext("小红");
                emitter.onError(new Error("error"));
            }
        }).onExceptionResumeNext(new Observable<String>() {

            @Override
            protected void subscribeActual(Observer observer) {

                observer.onNext("小张");
            }
        }).subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

                System.out.println("lybj" + "准备监听");
            }

            @Override
            public void onNext(String s) {

                System.out.println("lybj" + s);
            }

            @Override
            public void onError(Throwable e) {

                System.out.println("lybj" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("lybj" + "onComplete");
            }
        });

    }


    /**
     * 如果出现错误事件，则会重新发送所有事件序列。times 是代表重新发的次数。
     */
    @Test
    public void testRetry() {
        Observable.create(new ObservableOnSubscribe<String>() {

                    @Override
                    public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                        emitter.onNext("1");
                        emitter.onNext("2");
                        emitter.onError(new IllegalStateException());
                    }
                }).retry(2)
                .subscribe(new Observer<String>() {

                    @Override
                    public void onSubscribe(Disposable d) {

                        System.out.println("lybj" + "准备监听");
                    }

                    @Override
                    public void onNext(String s) {

                        System.out.println("lybj" + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                        System.out.println("lybj" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("lybj" + "onComplete");
                    }
                });


    }

}


