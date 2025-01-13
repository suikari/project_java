package inc;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;

import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.jsonwebtoken.Jwts.*;

public class JwtService {
	
	public static void main(String[] args) {
		
		createToken();
	}
  
  private static final String secretKey = "SpringSecurityKey_P@ssword_http://Spring.io";
  private final Key key = Keys.hmacShaKeyFor(secretKey.getBytes());

  public static String create(
          Map<String, Object> claims,
          LocalDateTime expireAt
  ) {
    var secretKeyBytes = Base64.getEncoder().encode(secretKey.getBytes());
    //임의로 반든 암호키로 key를 설정해 줍니다(hmacShaKeyFor)
    var key = Keys.hmacShaKeyFor(secretKeyBytes);

    //token 의 Expire 시간을 변환해 줍니다
    var _expireAt = Date.from(expireAt.atZone(ZoneId.systemDefault()).toInstant());
    return builder()
            .signWith(key, SIG.HS256)
            .claims(claims)
            .expiration(_expireAt)
            .compact();
  }

  public static void validate(String token) {
    var secretKeyBytes = Base64.getEncoder().encode(secretKey.getBytes());
    var key = Keys.hmacShaKeyFor(secretKeyBytes);

    var parser = parser()
            .verifyWith(key)
            .build();

    try {
      var result = parser.parseSignedClaims(token);
      System.out.print(result);
      //result.getPayload().forEach((key1, value1) -> log.info("key : {}, value : {}", key1, value1));
    } catch (Exception e) {
      if (e instanceof SignatureException) {
        throw new RuntimeException("JWT Token Invalid Exception");
      } else if (e instanceof ExpiredJwtException) {
        throw new RuntimeException("JWT Token Expired Exception");
      } else {
        throw new RuntimeException("JWT Exception");
      }
    } 
  }
  
  static void createToken() {
	    var claims = new HashMap<String, Object>();
	    claims.put("user_id", "devocean");

	    var expiredAt = LocalDateTime.now().plusMinutes(10);

	    var jwtToken = JwtService.create(claims, expiredAt);
	    System.out.println(jwtToken);
	    //log.info(jwtToken);
	  }

	static  void validateToken() {
		  JwtService.validate("콘솔에 출력한 토큰 값을 넣어 줍니다");
	   }
	  
}