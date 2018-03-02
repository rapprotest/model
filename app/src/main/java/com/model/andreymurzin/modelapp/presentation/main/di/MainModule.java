package com.model.andreymurzin.modelapp.presentation.main.di;
import com.model.andreymurzin.modelapp.app.di.scope.ActivityScope;
import com.model.andreymurzin.modelapp.utils.helper.BottomViewHelper;
import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    @ActivityScope
    static BottomViewHelper provideBottomHelper(){
      return new BottomViewHelper();
    }
}
