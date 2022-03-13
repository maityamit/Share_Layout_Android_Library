# Share Layout Android Library


## 🤔Problem : 

## ✅Solution : 

#### Just add this dependency ``` implementation 'com.github.maityamit:Share_Layout_Android_Library:1.0.0' ``` in yout project and you can use the method directly by call this ``` ShareLayout.simpleLayoutShare( Context , View , String ); ``` and easily share any screenshot 📱 via Intent. 

## ⚙️Gradle 

### Add this on build.gradle(project)
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
  
```
  
### Add this on build.gradle(module)
```
dependencies {
             ....
	     implementation 'com.github.maityamit:Share_Layout_Android_Library:1.0.0'
	}
```

## ♨️Java
``` 
ShareLayout.simpleLayoutShare( Context , View , String );
```

### Context : 
In which context you call this.
### View : 
Which view layout you want to share , which may be linear/relative or any type of

### String : 
Which String you want to share with Screensshot


# 📝Change Log

### 1. 1.0.0
Simple Share Layout Screenshot with text add this version. 
