package com.sevtinge.cemiuiler.module;

import com.sevtinge.cemiuiler.module.base.BaseModule;
import com.sevtinge.cemiuiler.module.thememanager.*;

import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class ThemeManager extends BaseModule {

    @Override
    public void handleLoadPackage() {
        initHook(new ThemeManagerDexKit());
        initHook(new DisableThemeAdNew(), mPrefsMap.getBoolean("various_theme_diable_ads"));
        initHook(new EnablePadTheme(), mPrefsMap.getBoolean("various_theme_enable_pad_theme"));
        initHook(new EnableFoldTheme(), mPrefsMap.getBoolean("various_theme_enable_fold_theme"));

        //修改版本号
        initHook(new VersionCodeModify(), mPrefsMap.getBoolean("theme_manager_version_code_modify"));
    }

}
