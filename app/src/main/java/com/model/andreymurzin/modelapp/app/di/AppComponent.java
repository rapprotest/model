package com.model.andreymurzin.modelapp.app.di;

import android.content.Context;

import com.model.andreymurzin.modelapp.app.App;
import com.model.andreymurzin.modelapp.navigation.NavigationModule;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {
        AppModule.class,
        NavigationModule.class,
        AndroidSupportInjectionModule.class,
        ActivityBinderModule.class})
public interface AppComponent {

    void inject(App app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder withContext(Context context);

        AppComponent build();
    }
}
