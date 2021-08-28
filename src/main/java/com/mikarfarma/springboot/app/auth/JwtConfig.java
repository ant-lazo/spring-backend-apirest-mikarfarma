package com.mikarfarma.springboot.app.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "mikar-farma.llave.secreta.boticas";
	
	public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEAw38LW7D/mQsbDr2r8PTjQGwQZi4Sf1SwcWKziAJqaBQNLNcl\r\n" + 
			"Xj4QbrInTkR+IsU2vpw/GNs2aQuX7rnIy9yQhD1Uqd1iPQc77b5/H51YoNpI8cX3\r\n" + 
			"5orHdpnNKst4/mpZMdieqBYrrgI6ZcMW5ig7Gtx0rfxFhSEoK5qGtwa6K21oEGDx\r\n" + 
			"+MqoSuIJNaqCrMKjsrGNPu/bpKr8OanCnf8aJGQkK7PcKkCPUT6dELt8p+cnWY1T\r\n" + 
			"aSjYjaKiiqwSSVoygt78sviw8LLVytaTBBM7Ah8NJdouO9kN0P5n90uF4lPfLDWN\r\n" + 
			"yZ5LVPgy4Zt7Ibhvm4JXPHG5Q4+d7F69Gi0JywIDAQABAoIBAQCwJILuXZ8enOQH\r\n" + 
			"Nxx54Zv0SqnH9xERixPjRaQvEsYe+poYYc04icEyi/BgU9Q2reyyd4NeeP0gTqLZ\r\n" + 
			"JKnoDNZlYAEtf9vo0uDLSE2wBYx6edMpjE7deQNZOCCkw2pECTxObjgdiMRYZ4eI\r\n" + 
			"cuvp+iuu+x1iOh/FYOeZygRBWp1ZTAkVrId7LdpV/jirlmKsuUDLvbw2S9p1GsPP\r\n" + 
			"trF1ev5x2UYjd0X1g536IavnK4Cw23Hws+KbSpZR1OE0+5LbK/UEB3q5cC/krL5/\r\n" + 
			"HXaqjAa0gjDO+d7D+qY/4n17+f/4InNwlURztAjid+bGDdbGXdZLpYLCeIrb1gAy\r\n" + 
			"JKMKdTqRAoGBAPGrwZtvF6nJ0yZSO/bOoxopJrruG4XPDLUD3d8L2FipqWrIT4eZ\r\n" + 
			"EZTGPkqiqzrfJQ4OJyzDotzBlNchEx7F77iZlOq4B159MLQcnvNJdCPNy8c64LZj\r\n" + 
			"iHOz3jlFdGnrat/S2ORTvq2J1N2oVu+4swj3cXqnB25h7BoplaTNaERJAoGBAM8W\r\n" + 
			"awomU5H1t281Tia36DhIl3NiPFeZYI5BnelWEdebnmsj2ufRvlfjoYmRaZaPoVmn\r\n" + 
			"E2Zx/xtwcSpsSU5+ER5r+RPjXx90Zyoslc6GaoXlu+Jv/WAdHrJJGcKV58HhBffk\r\n" + 
			"Xlx8YPkU25gi3TqTff/u/sBBn7u77iBhWlVyGXVzAoGACBVGlHxSvksR1OZLOyYO\r\n" + 
			"LoHR2c68/Oy/8A4BDcTHp6+FCx1IC7EC9Ybr7nMiZwWvp5ixlr20ZM3UvJ1Olmjo\r\n" + 
			"a7Q3VuJw3KgzSNLsPhbm24u2lSNTAMazeas6c4/vJNvK51GWD4z9g7BofkFzJvF2\r\n" + 
			"i4Y7NW8AwKBl1Tou1yRHqIECgYEAlmmRC4k07/IJ7wNHpUW0rJTFNDBo5bNod0rf\r\n" + 
			"mGhEg1brpKQhTnmAiDO008fDanEeX5DDvYgVI+fyuj52rEVSx8bi3fgq0hzpBa/m\r\n" + 
			"i2AEJQbtBZYT8eiUsCf6RuQ8tgxsGlZL118bzC7DJOhFyVLxlKARdrDzhRcF6Yzs\r\n" + 
			"YN2D8lMCgYEA68xMa5ct2mnD7CuDQEhFSSIPy2AsHA54jMwsH6peFpVFfgw5hstS\r\n" + 
			"BnTB/A+eY2C4N6gKIMgcV2PNcnD1kfmSP5AHpRSQWU5AbIiR+TocKqhd+F5s5ocN\r\n" + 
			"DqioUTBtAfOi2G7vx/SB2VcTKQh0iYfB44PoH6Jf/m6H44aYzoGwdds=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAw38LW7D/mQsbDr2r8PTj\r\n" + 
			"QGwQZi4Sf1SwcWKziAJqaBQNLNclXj4QbrInTkR+IsU2vpw/GNs2aQuX7rnIy9yQ\r\n" + 
			"hD1Uqd1iPQc77b5/H51YoNpI8cX35orHdpnNKst4/mpZMdieqBYrrgI6ZcMW5ig7\r\n" + 
			"Gtx0rfxFhSEoK5qGtwa6K21oEGDx+MqoSuIJNaqCrMKjsrGNPu/bpKr8OanCnf8a\r\n" + 
			"JGQkK7PcKkCPUT6dELt8p+cnWY1TaSjYjaKiiqwSSVoygt78sviw8LLVytaTBBM7\r\n" + 
			"Ah8NJdouO9kN0P5n90uF4lPfLDWNyZ5LVPgy4Zt7Ibhvm4JXPHG5Q4+d7F69Gi0J\r\n" + 
			"ywIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
