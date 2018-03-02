package com.model.andreymurzin.modelapp.presentation.main.di;
import com.model.andreymurzin.modelapp.R;
import com.model.andreymurzin.modelapp.app.di.scope.ActivityScope;
import com.model.andreymurzin.modelapp.navigation.MainActivityNavigation;
import com.model.andreymurzin.modelapp.presentation.main.MainActivity;
import com.model.andreymurzin.modelapp.utils.delegat.ToolbarTitleDelegate;
import com.model.andreymurzin.modelapp.utils.helper.BottomViewHelper;
import dagger.Module;
import dagger.Provides;
import ru.terrakok.cicerone.android.SupportAppNavigator;

@Module
public class MainModule {

    @Provides
    @ActivityScope
    static BottomViewHelper provideBottomHelper(){
      return new BottomViewHelper();
    }

    @Provides
    @ActivityScope
    static ToolbarTitleDelegate provideTitleDelegate(MainActivity activity) {
        return new ToolbarTitleDelegate(activity);
    }

    @Provides
    @ActivityScope
    static SupportAppNavigator provideMainActivityNavigation(MainActivity activity) {
        return new MainActivityNavigation(activity, R.id.container);
    }
}
