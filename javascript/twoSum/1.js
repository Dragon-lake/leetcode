// two Sum
// easy

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
	var p1 = 0;
	var p2 = 1;
	var len = nums.length;
	var result = [];
	var sum = 0;
	var isfind = false;
	while (!(p1 >= len || isfind)) {

		sum = nums[p1] + nums[p2]
		if (sum == target) {
			result.push(p1);
			result.push(p2);
			isfind = true;
		}
		if (p2 == len) {
			p1++;
			p2 = p1 + 1;
		} else {
			p2++
		}
	}
	if (isfind) {
		return result;
	} else {
		return 0
	}
};
var nums = [2, 7, 11, 15],
	target = 9;
console.log(twoSum(nums, target));