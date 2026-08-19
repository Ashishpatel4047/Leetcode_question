class Solution(object):

    def numberHasEvenDigit(self, num):
        digit_count = 0

        while num != 0:
            digit_count += 1
            num = num // 10

        return digit_count % 2 == 0

    def findNumbers(self, nums):
        even_count = 0

        for i in range(len(nums)):
            if self.numberHasEvenDigit(nums[i]):
                even_count += 1

        return even_count