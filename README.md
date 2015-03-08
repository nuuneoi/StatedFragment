# StatedFragment

The library is documented in https://medium.com/@nuuneoi/probably-be-the-best-way-to-save-restore-android-fragments-state-so-far-c01d98711c2

# Version

0.9.1

# Installation

To use this library in your android project, just simply add the following dependency into your build.gradle

```sh
dependencies {
    compile 'com.inthecheesefactory.thecheeselibrary:stated-fragment-support-v4:0.9.1'
}
```

# Usage

Extends StatedFragment and save state in `onSaveState(Bundle outState)` and restore state in `onRestoreState(Bundle savedInstanceState)`. You are also able to override `onFirstTimeLaunched()`, if you want to do something as the first time the fragment is launched (is not called again after that).

```java
public class MainFragment extends StatedFragment {

    ...
    
    /**
     * Save Fragment's State here
     */
    @Override
    protected void onSaveState(Bundle outState) {
        super.onSaveState(outState);
        // For example:
        //outState.putString("text", tvSample.getText().toString());
    }

    /**
     * Restore Fragment's State here
     */
    @Override
    protected void onRestoreState(Bundle savedInstanceState) {
        super.onRestoreState(savedInstanceState);
        // For example:
        //tvSample.setText(savedInstanceState.getString("text"));
    }
    
    ...

}
```

# Change Logs

### v0.9.1

Change Android Support Library v4 dependency's version to 21.+ to avoid future dependency conflict.

### v0.9.0

Seperates library into two versions:
- stated-fragment-support-v4: Fragment is inherited from android.support.v4.app.fragment
- stated-fragment: Fragment is inherited from android.app.fragment


# License
Apache 2.0
