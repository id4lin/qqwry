/**
 * 实现方式二：
 * 采用byte数组方式读取,
 * 经过测试效率略高于内存映射文件,
 * 且是线程安全的,不用同步或加锁(实际里面加锁是为了实现不重启情况下升级qqwry.dat文件)
 */
package com.difeng.qqwry2;