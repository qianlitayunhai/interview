# interview
Java开发工程师常见面试问题，算法解析等
1. 求一个数值的整数次幂
**求解思路：**
- 需要判断幂值的情况
	 - M=0：底数为任意值，结果为1;
	 - M<0：底数不能为0，否则为无效输入；结果为倒数
	 - M>0：底数为任意值
- 利用指数的二进制表示方法，使用&1和>>1逐位读取指数的二进制数据n，当n&1==1时，将该位所代表的乘数累乘到最终结果中。
- 原理：如10^1101 = 10^0001*10^0100*10^1000，代表10^13

**源码地址**：[数值的整数次幂](https://github.com/sombie007/interview/blob/master/src/main/java/com/org/algorithm/Power.java)