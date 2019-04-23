package com.kunminx.rxmagic;

import android.app.Application;

import com.kunminx.samples.model.Events;
import com.kunminx.samples.ui.rxbus.RxBus;

import java.util.concurrent.TimeUnit;

import io.github.kbiakov.codeview.classifier.CodeProcessor;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Created by threshold on 2017/1/12.
 */

public class MyApplication extends Application {

    public static final String TAG = "MyApplication";
    private RxBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
//        bus = new RxBus();
        CodeProcessor.init(this);
    }

   /* public RxBus bus() {
        return bus;
    }

    public void sendAutoEvent() {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) {
                        bus.send(new Events.AutoEvent());
                    }
                });
    }*/

}