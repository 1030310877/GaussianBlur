# GaussianBlur
伪高斯模糊NDK

参考http://blog.ivank.net/fastest-gaussian-blur.html 以及 http://www.blackpawn.com/texts/blur/default.html 完成。

###原理
使用3次的均值模糊来实现与高斯模糊相近的效果，并减少时间复杂度。


####问题
实际使用中发现，同一模糊半径，实现的模糊效果与PS中的高斯模糊效果相差还是很大的。

原图：<br>
![](https://github.com/1030310877/GaussianBlur/blob/master/app/src/main/res/drawable/bp.jpg)
</br>
效果图：<br>
![](https://github.com/1030310877/GaussianBlur/blob/master/blur.png)
