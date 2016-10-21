# GaussianBlur
高斯模糊实现：
1.使用三次均值模糊模拟高斯模糊（fastblur）；
参考http://blog.ivank.net/fastest-gaussian-blur.html 以及 http://www.blackpawn.com/texts/blur/default.html 完成。
2.使用RenderScript进行高斯模糊；


###原理
使用3次的均值模糊来实现与高斯模糊相近的效果，并减少时间复杂度。


####问题
实际使用中发现，两种方式实现出来的效果差别很大，同半径下，fastblur慢但是效果好。

原图：<br>
![](https://github.com/1030310877/GaussianBlur/blob/master/app/src/main/res/drawable/bp.jpg)
</br>
效果图：<br>
![](https://github.com/1030310877/GaussianBlur/blob/master/blur.png)
