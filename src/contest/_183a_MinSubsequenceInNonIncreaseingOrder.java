// package contest;
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
//
// import com.sun.tools.classfile.StackMapTable_attribute.verification_type_info;
// import com.sun.tools.javac.code.Type.ForAll;
//
// public class _183a_MinSubsequenceInNonIncreaseingOrder {
//
// 	public List<Integer> minSubsequence(int[] nums) {
//
// 		int n = nums.length;
// 		List<Integer> res = new ArrayList<>();
// 		Arrays.sort(nums);
//
// 		int total = 0;
// 		for (int a : nums) {
// 			total += a;
// 		}
//
// 		int temp = 0;
// 		int left = total;
//
// 		for (int i = n - 1; i >= 0; i--) {
// 			res.add(nums[i]);
// 			temp += nums[i];
// 			left -= nums[i];
//
// 			if (temp > left) {
// 				return res;
// 			}
// 		}
// 		return res;
// 	}
//
// //	public List<Integer> minSubsequence(int[] nums) {
// //        Arrays.sort(nums);
// //        long s = 0;
// //        for(int v : nums){
// //        	s += v;
// //        }
// //        List<Integer> ret = new ArrayList<>();
// //        for(int i = nums.length-1;i >= 0;i--){
// //        	ret.add(nums[i]);
// //        	s -= 2*nums[i];
// //        	if(s < 0)break;
// //        }
// //        return ret;
// //    }
// 	public List<Integer> minSubsequence_1(int[] nums) {
// 		Arrays.sort(nums);
// 		int s = 0;
// 		for (int v : nums)
// 			s += v;
// 		List<Integer> res = new ArrayList<>();
// 		for (int i = nums.length - 1; i >= 0; i--) {
// 			res .add(nums[ i ]) ;
// 			s -=
// 		}
// 	}
//
// }
