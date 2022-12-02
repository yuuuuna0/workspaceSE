package com.itwill05.service.array.account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {

	public static final int SORT_BY_NO = 1;
	public static final int SORT_BY_OWNER = 2;
	public static final int SORT_BY_BALANCE = 3;
	public static final int SORT_BY_IYUL = 4;

	public static final int SORT_ASC = 1;
	public static final int SORT_DESC = 2;

	private Account[] accounts = { 
			new Account(1111, "KIM", 85000, 5.9), new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };

	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 - 기존배열보다큰배열생성 - 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		this.addAccount(newAccount);
		/*
		 * 1.배열크기증가 - 기존배열보다큰배열생성 - 기존데이타 옮김
		 */
		/*
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
		*/
	}

	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		int totalAcc=accounts.length;
		return totalAcc;
	}

	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		int totalBalance=0;
		for(int i=0;i<accounts.length;i++) {
			totalBalance+=accounts[i].getBalance();
		}
		return totalBalance;
	}

	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		Account findAcc=new Account();
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==no) {
				findAcc=accounts[i];
				break;
			}
		}
		return findAcc;
	}

	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 - findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int count=0;
		for (Account account : accounts) {
			if(account.getBalance()>=balance) {
				count++;
			}
		}
		Account[] findAcc=new Account[count];
		int a=0;
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i].getBalance()>=balance) {
				findAcc[a]=accounts[i];
				a++;
			}
		}
		return findAcc;
	}

	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		int count=0;
		for (Account account : accounts) {
			if(account.getIyul()>=iyul) {
				count++;
			}
		}
		Account[] findAcc=new Account[count];
		int a=0;
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i].getIyul()>=iyul) {
				findAcc[a]=accounts[i];
				a++;
			}
		}
		return findAcc;
	}

	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByName(String name) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 - findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int count=0;
		for (Account account : accounts) {
			if(account.getOwner().equals(name)) {
				count++;
			}
		}
		Account[] findAcc=new Account[count];
		int a=0;
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i].getOwner().equals(name)) {
				findAcc[a]=accounts[i];
				a++;
			}
		}
		return findAcc;
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금한후 입금계좌 참조변수반환
	 */
	public Account ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기 2.입금 3.입금계좌 참조변수반환
		 */
		/*
		Account findAcc=null;
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.deposit(m);
				findAcc=account;
				break;
			}
		}
		return findAcc;
		*/
		Account findAcc=this.findByNo(no);
		findAcc.deposit(m);
		return findAcc;
	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public Account chulGum(int no, int m) {
		/*
		Account findAcc=null;
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.withdraw(m);
				findAcc=account;
				break;
			}
		}
		*/
		Account findAcc=this.findByNo(no);
		findAcc.withdraw(m);
		return findAcc;
	}

	/*
	 * 10,11 정렬 standard --> 1:번호,2:이름,3:잔고,4:이율 order --> 1:오름차순,2:내림차순
	 */
	public void sort(int standard, int order) {
		if(standard==1) {
			this.sortByNo(order);
		} else if(standard==2) {
			this.sortByName(order);
		} else if(standard==3) {
			this.sortByBalance(order);
		} else if(standard==4) {
			this.sortByIyul(order);
		}
	}
	
	private void sortByNo(int order) {
		if(order==1) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getNo() > accounts[j + 1].getNo()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		} else if(order==2) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getNo() < accounts[j + 1].getNo()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		}
	}
	private void sortByName(int order) {
		if(order==1) {
			for(int i=0;i<accounts.length-1;i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())>0) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		} else if(order==2) {
			for(int i=0;i<accounts.length-1;i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())<0) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		}
	}
	private void sortByBalance(int order) {
		if(order==1) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		} else if(order==2) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		}
	}
	private void sortByIyul(int order) {
		if(order==1) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getIyul() > accounts[j + 1].getIyul()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		} else if(order==2) {
			for (int i = 0; i < accounts.length - 1; i++) {
				for (int j = 0; j < accounts.length - 1; j++) {
					if (accounts[j].getIyul() < accounts[j + 1].getIyul()) {
						Account tempacc = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempacc;
					}
				}
			}
		}
	}

	/*
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	 
	public void updateAccount(Account updateAccount) {
		/**********************case1(비효율적)*****************************
		Account account=this.findByNo(updateAccount.getNo());
		account.setBalance(updateAccount.getBalance());
		account.setIyul(updateAccount.getIyul());
		account.setOwner(updateAccount.getOwner());
		*/
		for(int i=0;i<accounts.length;i++) {
			if(updateAccount.getNo()==accounts[i].getNo()) {
				accounts[i]=updateAccount;
				break;
			}
		}
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		Account findAcc=this.findByNo(no);
		findAcc.setAccountData(no, owner, balance, iyul);
		/*************************case2(비효율적)*****************************
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].setAccountData(no, owner, balance, iyul);
			}
		}
		*/
		Account updateAccount=new Account(no, owner, balance, iyul);
		this.updateAccount(updateAccount);
	}

	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] A. 배열에서 Account객체삭제 B. 배열사이즈감소 C. 삭제한계좌객체반환
	 * 
	 */
	public Account deleteByNo(int no) {
		Account deleteAcc=null;
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==no) {
				deleteAcc=accounts[i];
				accounts[i]=null;
			}
		}
		Account[] tempAcc=new Account[accounts.length-1];
		int a=0;
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
				tempAcc[a]=accounts[i];
				a++;
			}
		}
		accounts=tempAcc;
		return deleteAcc;
	}

}
