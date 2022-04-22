WCatalog 是一个基于Gradle 7.0的统一依赖项目。目前是发布到本地仓库中。
位置：～.m2/repository
使用：
```
# settings.gradle
dependencyResolutionManagement {
    //...
    repositories {
        mavenLocal()
        //...
    }
}

enableFeaturePreview('VERSION_CATALOGS')
dependencyResolutionManagement {
    versionCatalogs {
        libs {
            from("com.wim.catalog:catalog:0.0.1")
        }
    }
}

```

## AndroidX

| 依赖 | 版本 |
| --- | --- |
| androidx.core:core-ktx | 1.7.0 |
| androidx.appcompat:appcompat | 1.4.1 |
| androidx.fragment:fragment-ktx | 1.3.6 |
| [androidx.datastore:datastore-preferences](https://developer.android.com/topic/libraries/architecture/datastore?hl=zh-cn) | 1.0.0 |
| androidx.recyclerview:recyclerview | 1.2.1 |
| androidx.collection:collection-ktx | 1.1.0 |
| androidx.constraintlayout:constraintlayout | 2.1.1 |

## 集成的通用库

### 🍫 [Kotlin](https://developer.android.com/kotlin/add-kotlin?hl=zh-cn) 版本：1.6.20
Kotlin支持

| 依赖 | 介绍 |
| --- | --- |
| androidx.kotlin:kotlin-stdlib | 基础包 |
| androidx.kotlin:kotlinx-coroutines-core | 对 Room 的 Kotlin 扩展和协程支持 |
| androidx.kotlin:kotlinx-coroutines-android | 对 Room 的 Kotlin 扩展和协程支持 |

### 🎨 [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle?hl=zh-cn) 版本：2.4.0
androidx.lifecycle 软件包提供了可用于构建生命周期感知型组件的类和接口 - 这些组件可以根据 Activity 或 Fragment 的当前生命周期状态自动调整其行为。

| 依赖 | 介绍 |
| --- | --- |
| [androidx.lifecycle:lifecycle-runtime-ktx](https://developer.android.com/jetpack/androidx/releases/lifecycle) | 基础包 |
| androidx.lifecycle:lifecycle-compiler | 注解 |
| androidx.lifecycle:lifecycle-livedata-ktx | LiveData |
| androidx.lifecycle:lifecycle-viewmodel-ktx | ViewModel |

### 📖 [Navigation](https://developer.android.com/guide/navigation) 版本：2.3.5
导航是指支持用户导航、进入和退出应用中不同内容片段的交互。

| 依赖 | 介绍 |
| --- | --- |
| androidx.navigation:navigation-ui-ktx | 基础包 |
| androidx.navigation:navigation-fragment-ktx | 基础包 |

### 📖 [Hilt](https://developer.android.com/training/dependency-injection/hilt-android?hl=zh-cn) 版本：2.40.5
Hilt 是 Android 的依赖项注入库，可减少在项目中执行手动依赖项注入的样板代码。
在`app/build.gradle`中添加
```
...
apply plugin: 'kotlin-kapt'
apply plugin: 'dagger.hilt.android.plugin'

android {
    ...
}

dependencies {
    implementation "com.google.dagger:hilt-android:2.28-alpha"
    kapt "com.google.dagger:hilt-android-compiler:2.28-alpha"
}
```

| 依赖 | 介绍 |
| --- | --- |
| androidx.hilt:hilt-android | 基础包 |
| androidx.hilt:hilt-android-compiler | 注解 |
| androidx.hilt:hilt-compiler | jetpack集成 |
| androidx.hilt:hilt-lifecycle-viewmodel | jetpack集成 |

### 🍫 [Room](https://developer.android.com/training/data-storage/room?hl=zh-cn) 版本：2.4.2
Room 持久性库在 SQLite 上提供了一个抽象层，以便在充分利用 SQLite 的强大功能的同时，能够流畅地访问数据库。具体来说，Room 具有以下优势：
* 针对 SQL 查询的编译时验证。
* 可最大限度减少重复和容易出错的样板代码的方便注解。
* 简化了数据库迁移路径。

| 依赖 | 介绍 |
| --- | --- |
| androidx.room:room-runtime<br>androidx.room:room-compiler| 基础包 |
| androidx.room:room-ktx | 对 Room 的 Kotlin 扩展和协程支持 |

### 📫 [Material](https://developer.android.com/guide/topics/ui/look-and-feel?hl=zh-cn) 版本：1.4.0
适用于 Android 的 Material Design

| 依赖 | 介绍 |
| --- | --- |
| com.google.android.material:material | 基础包 |

### ⏳ [Network](https://square.github.io/retrofit/) 版本：2.9.0
网络框架

| 依赖 | 介绍 |
| --- | --- |
| com.squareup.retrofit2:retrofit | 网络使用框架 |
| com.squareup.retrofit2:converter-moshi | 网络数据解析成json |
| com.squareup.okhttp3:okhttp | 网络请求框架 |
| com.squareup.okhttp3:logging-interceptor | 网络请求日志 |

### 🌊 [Coil](https://coil-kt.github.io/coil/README-zh/) 版本：1.4.0
图片加载框架

| 依赖 | 介绍 |
| --- | --- |
| io.coil-kt:coil | 基础包 |
| io.coil-kt:coil-gif | Gif支持 |
| io.coil-kt:coil-svg | Svg支持 |

### 🧭✨[Moshi](https://github.com/square/moshi) 版本：1.13.0
Json解析

| 依赖 | 介绍 |
| --- | --- |
| com.squareup.moshi:moshi-kotlin | 基础包 |
| com.squareup.moshi:moshi-kotlin-codegen | 通过注解生成代码 |

### 🧭🎨️ 其它
第三方依赖

| 依赖 | 介绍 |
| --- | --- |
| com.github.permissions-dispatcher:permissionsdispatcher | 权限请求 |
| com.github.CymChad:BaseRecyclerViewAdapterHelper | RecyclerView Adapter工具类 |