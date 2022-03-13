# Share Layout Android Library


## 🤔Problem : 

#### In Android Studio for any Application to share any ``` Layout Screenshot ``` via Intent , you need to write methods where you write the whole code .. 
#### 1. Take Screenshot from the layout
#### 2. Convert into Bitmap 
#### 3. Share Methods where you will share the image and string via Intent

#### There you write the whole code for share , this take too long so for that Now you can write this in a single line . 

## ✅Solution : 

#### Just add this dependency ``` implementation 'com.github.maityamit:Share_Layout_Android_Library:1.0.0' ``` in yout project and you can use the method directly by call this ``` ShareLayout.simpleLayoutShare( Context , View , String ); ``` and easily share any screenshot 📱 via Intent. 


## 📱Sample 
 <p align="center">
  <a ><img src="https://github.com/maityamit/Share_Layout_Android_Library/blob/master/app/demo.png" width="22%" /></a>
	
	
<br>

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
	
	
<br>
<h1 align=center> Created By  🤵 </h1>

  <p align="center">
  <a href="https://github.com/maityamit"><img src="https://avatars.githubusercontent.com/u/74618071?v=4" width="11%" /></a>

  <p align="center">
  <a target="_blank"href="https://www.linkedin.com/in/maityamit/"><img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="maityamit308@gmail.com"><img src="https://img.shields.io/badge/gmail-%23D14836.svg?&style=for-the-badge&logo=gmail&logoColor=white" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://www.instagram.com/amit_maity_2003/"><img src="https://img.shields.io/badge/instagram-%23D14836.svg?&style=for-the-badge&logo=instagram&logoColor=pink" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
</p>
  
  <br>


# 📝Change Log

### 1. 1.0.0
Simple Share Layout Screenshot with text add this version. 
