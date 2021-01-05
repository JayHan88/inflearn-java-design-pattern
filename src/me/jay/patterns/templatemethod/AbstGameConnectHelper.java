package me.jay.patterns.templatemethod;

abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);

	protected abstract Boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract void connection(String info);

	// template method
	public void requestConnection(String encodedInfo) {

		// 보안 작업
		String decodedInfo = doSecurity(encodedInfo);

		String id = "AAA";
		String password = "BBB";

		// 인증 작업
		if (!authentication(id, password)) {
			throw new Error("아이디 또는 암호 불일치");
		}

		// 권한 작업
		String userName = "CCC";
		int auth = authorization(userName);

		switch (auth) {
			case -1:
				throw new Error("청소년 회원은 10시 이후에 접속할 수 없습니다.");
			case 0:
				System.out.println("게임 매니저");
				break;
			case 1:
				System.out.println("유료 회원");
				break;
			case 2:
				System.out.println("무료 회원");
				break;
			case 3:
				System.out.println("권한 없음");
				break;
			default:
				System.out.println("기타 상황");
				break;
		}

		connection(decodedInfo);
	}

}
