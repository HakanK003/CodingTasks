/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

/*
    Related Topics
    -> Array
    -> Hash Table
*/

// S1 - Brute Force
// Time Complexity O(n^2)
var twoSum = function(nums, target) {

    for (var i = 0; i < nums.length; i++) {

        for(var j = 0; j < nums.length; j++){

            if(i!=j && nums[i]+nums[j]==target){

                return [i, j];

            }
        }

    }

};

// S2 - Map
// Time Complexity O(n)
var twoSum = function(nums, target) {
    const diffMap = new Map();

    for (let i = 0; i < nums.length; i++) {
        if (diffMap.has(nums[i])) {
            return [diffMap.get(nums[i]), i];
        } else {
            const diff = target - nums[i];
            diffMap.set(diff, i);
        }
    }

    return [-1, -1];
};


// S3 - Map2
// Time Complexity O(n)
var twoSum = function(nums, target) {
	let hash = {};

	for(let i = 0; i < nums.length; i++) {
		const n = nums[i];
		if(hash[target - n] !== undefined) {
			return [hash[target - n], i];
		}
		hash[n] = i;
	}
	return [];
}