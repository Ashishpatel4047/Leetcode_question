class Solution(object):
    def sortArrayByParity(self, nums):
        i = 0
        j = len(nums) - 1

        while i < j:
            mod1 = nums[i] % 2
            mod2 = nums[j] % 2

            if mod1 == 1 and mod2 == 0:
                temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp

            if mod1 == 0:
                i += 1

            if mod2 == 1:
                j -= 1

        return nums