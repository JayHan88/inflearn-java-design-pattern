package me.jay.patterns.templatemethod;

public class DefauiltGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("강화된 알고리즘을 이용한 디코드");
		return string;
	}

	@Override
	protected Boolean authentication(String id, String password) {
		System.out.println("아이디, 암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권환 확인");
		// 서버에서 유저 아이드를 가지고 유저의 나이를 알 수 있다.
		// 나이와 시간을 확인하고, 성인이 아닌 아이디 유저가 10시 이후에 접속한다면 권한이 없는 것으로 처리한다.
		return 0;
	}

	@Override
	protected void connection(String info) {
		System.out.println("마지막 접속 단계");
	}
}