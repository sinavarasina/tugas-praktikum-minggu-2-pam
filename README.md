# Tugas 2 PAM - News Feed App 
> this app i made to fullfill my homework/task
> see [this module](https://kuliah2.itera.ac.id/pluginfile.php/63172/mod_resource/content/1/Materi_02_Advanced_Kotlin_Coroutines_Flow.pdf) for more details.

---

## Student Identity
Name = Varasina Farmadani  
NIM = 123140107  
Class = PAM RA  

## Screenshoot
![Full IDE](screenshoots/SS2.0.png)
![Just EMU](screenshoots/SS2.1.png)

## Code Documentation

WIP

---

This is a Kotlin Multiplatform project targeting Android.

* [/composeApp](./composeApp/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./composeApp/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./composeApp/src/jvmMain/kotlin)
    folder is the appropriate location.

### Build and Run Android Application

To build and run the development version of the Android app, use the run configuration from the run widget
in your IDE’s toolbar or build it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
