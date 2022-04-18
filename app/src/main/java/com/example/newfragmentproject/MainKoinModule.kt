package com.example.newfragmentproject

import android.os.Environment
import androidx.work.impl.model.Dependency
import com.example.newfragmentproject.ui.main.MainFragment
import org.koin.core.qualifier.named
import org.koin.core.scope.ScopeID
import org.koin.dsl.module

class MySingle
class MyFactory

class MyActivityScope
class MyActivityFactory

class MyFragmentScope
class MyFragmentFactory

val mainKoinModule =
    module {

        single { MySingle() }
        factory { MyFactory() }

        scope<MainActivity> {
            scoped { MyActivityScope() }
            factory { MyActivityFactory() }
        }

        scope<MainFragment> {
            scoped { MyFragmentScope() }
            factory { MyFragmentFactory() }
        }
    }