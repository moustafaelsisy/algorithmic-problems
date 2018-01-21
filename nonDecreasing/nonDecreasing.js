/**
 * @param {number[]} nums
 * @return {boolean}
 */
var checkPossibility = function(nums) {
    let alreadyModified = false
    for(let i = 0; i < nums.length-1; i++){
	     //Violation to non-decreasing order
        if(nums[i] > nums[i+1]){
            if(alreadyModified){
                return false
            }
            alreadyModified = true
	          //Determine how to swap by looking at neighbours
            if(i > 0 && nums[i-1] > nums[i+1]){
                nums[i+1] = nums[i]
            }
            else{
                nums[i] = nums[i+1]
            }
        }
    }
    return true
};
