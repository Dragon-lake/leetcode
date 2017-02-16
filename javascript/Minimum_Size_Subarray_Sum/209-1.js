 // Minimum Size Subarray Sum
 var s = 7;
 var array = [2, 3, 1, 2, 4, 3]

 /**
  * @param {number} s
  * @param {number[]} nums
  * @return {number}
  */


 // 思路： 遍历数组
 // 第一遍： 1 个数字？ = s；
 // 第二遍： 2 个人数字？ = s；
 // 	...
 // 第array.length遍： len个数字？ = s， 如果没有找到就返回0
 var minSubArrayLen = function(s, nums) {
 	var result = []
 	var temp = [];
 	var sum = 0;
 	var isfind = false;
 	var i = 1;
 	while (!isfind) {
 		nums.forEach(function(x, index) {
 			temp.push(x);
 			if (temp.length == i) {
 				sum = sumOfArray(temp);
 				if (sum == s) {
 					return temp;
 				}
 			} else if (temp.length < i) {
 				temp.push(x);
 			} else if (temp.length > i) {
 				temp.shift();
 				sum = sumOfArray(temp);
 				if (sum == s) {
 					isfind = true;
 				}
 			}
 		});
 		i++;
 	}
 	if (isfind) {
 		return i - 1;
 	} else {
 		return 0;
 	}

 };

 // compute sum of temp array
 var sumOfArray = function(array) {
 	var x = 0;
 	array.forEach(function(i) {
 		x = x + i;
 	})
 	return x;
 }
 var result = minSubArrayLen(s, array);
 console.log('result:' + result);