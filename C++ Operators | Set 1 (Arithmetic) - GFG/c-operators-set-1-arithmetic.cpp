//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    vector<int> cppOperators(int A, int B) {
        vector<int> ans;
        int add, mul, sub, div;
        add = A + B;
        ans.push_back(add);
        mul = A * B;
        ans.push_back(mul);
        if(A>B)
        {
            sub = A - B;
            ans.push_back(sub);
            div = A / B;
            ans.push_back(div);
        }
        else
        {
            sub = B - A;
            ans.push_back(sub);
            div = B / A;
            ans.push_back(div);
        }
        return ans;
    }
    // ans = {3, 2, 1, 2}
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int A, B;
        cin >> A >> B;
        Solution ob;
        vector<int> ans = ob.cppOperators(A, B);
        for (int u : ans) cout << u << "\n";
    }
}
// } Driver Code Ends