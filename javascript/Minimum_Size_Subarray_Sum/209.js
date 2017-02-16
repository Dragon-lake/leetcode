var minSubArrayLen = function(s, nums) {
	var len = nums.length;
	if (len === 0) {
		return 0;
	}
	var p1 = 0;
	var p2 = 0;
	var sum = nums[p1];
	var minlen = Infinity;
	var isfind = false;
	while (p2 < len) {
		if (sum < s) {
			p2++;
			sum += nums[p2];
		} else {
			isfind = true;
			if (p2 - p1 + 1 < minlen) {
				minlen = p2 - p1 + 1;
			}
			if (sum - nums[p1] >= s) {
				sum -= nums[p1];
				p1++;
			} else {
				p2++;
				sum += nums[p2];
			}
		}
	}
	if (isfind) {
		return minlen;
	} else {
		return 0;
	}
};
var s = 7;
var array = [2, 3, 1, 2, 4, 3]
var result = minSubArrayLen(s, array);
console.log('result:' + result);