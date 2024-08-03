# JUnit Testing Project

This repository contains a JUnit testing project for a banking application. The project includes a series of test cases designed to ensure the correctness of various functionalities such as login, account registration, withdrawals, deposits, and account information updates.

## Test Cases

Below is a summary of the test cases included in this project:

| Test Case No | Test Case Description                                                           | Expected Result                                               | Actual Result                                                 | Test Status |
|--------------|---------------------------------------------------------------------------------|---------------------------------------------------------------|---------------------------------------------------------------|-------------|
| 1            | Login with Account No. and Password with correct arguments                      | Logged in with Account No. and Password                       | Logged in with Account No. and Password                       | Pass        |
| 2            | Login with Account No. and Password with wrong arguments                        | Login Failed                                                  | Login Failed                                                  | Pass        |
| 3            | Register Account with provided arguments                                        | New Account Created with Account No and Password              | New Account Created with Account No and Password              | Pass        |
| 4            | Withdraw amount from Account with correct Account No. and deduction amount provided | Rs. 6700                                                      | Rs. 6700                                                      | Pass        |
| 5            | Withdraw amount from Account with wrong Account No. and deduction amount provided | Rs. 6600                                                      | Rs. 5550.0                                                    | Fail        |
| 6            | Deposit amount to Account with correct Account No. and amount provided          | Rs. 5950                                                      | Rs. 5950                                                      | Pass        |
| 7            | Deposit amount to Account with wrong Account No. and amount provided            | Rs. 9600                                                      | Rs. 7600                                                      | Fail        |
| 8            | Change Nominee for associated Account for given Account No.                     | Change the Account’s Nominee with given argument              | Account’s Nominee field changed                               | Pass        |
| 9            | Change Phone Number for associated Account for given Account No.                | Change the Account’s Phone Number with given argument         | Account’s Phone Number field changed                          | Pass        |
| 10           | Change Password for associated Account for given Account No.                    | Change the Account’s Password with given argument             | Account’s Password field changed                              | Pass        |
| 11           | Transfer the Amount from One Account to Another passed as an argument with correct calculation | Debit amount from one account and credit to another account   | Amount debited from one account and credited to another       | Pass        |
| 12           | Transfer the Amount from One Account to Another passed as an argument with one wrong input | Debit amount from one wrong account and credit to another account | Account debited from wrong account and credited to another one | Pass        |
| 13           | Display the Account information                                                 | Display Account’s information                                 | Account information displayed                                 | Pass        |

