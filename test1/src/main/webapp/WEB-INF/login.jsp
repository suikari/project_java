<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="utf-8">


<%
	String fail = request.getParameter("fail");  //
%>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Login </title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">페이지 방문을 환영합니다! </h1>
                                    </div>
                                    <form class="loginForm" id ="loginForm" name="loginForm"  method="POST">
                                        <div class="form-group">
                                            <input type="text"  id="userId" name="userId" class="form-control form-control-user" placeholder="Enter id...">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" id="pwd" name="pwd" class="form-control form-control-user" placeholder="Password">
                                        </div>
                                        <%  if (fail != null && fail.length() != 0){ if (fail.equals("Y")) {%>                                         <div class="form-group">
                                          		ID또는 비번을 다시 확인해주세요.  
                                         </div>                                       	
                                        <% } }%>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Remember
                                                    Me</label>
                                            </div>
                                        </div>
                                        <a onclick="fnLogin()" class="btn btn-primary btn-user btn-block">
                                            Login
                                        </a>
                                        <hr>
                                        <a href="index.jsp" class="btn btn-google btn-user btn-block">
                                            <i class="fab fa-google fa-fw"></i> Login with Google
                                        </a>
                                        <a href="index.jsp" class="btn btn-facebook btn-user btn-block">
                                            <i class="fab fa-facebook-f fa-fw"></i> Login with Facebook
                                        </a>
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <a class="small" href="forgot-password.html">Forgot Password?</a>
                                    </div>
                                    <div class="text-center">
                                        <a class="small" href="register.html">Create an Account!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <script>
        function fnLogin() {
            var userId = document.getElementById("userId").value;
            var pwd = document.getElementById("pwd").value;

            // 유효성 검사
            if (!userId || !pwd) {
                alert("아이디와 비밀번호를 입력하세요.");
                return;
            }

            // AJAX 요청
            $.ajax({
                url: "login.dox", // 로그인 처리를 위한 URL
                dataType: "json",
                type: "POST",
                data: {
                    userId: userId,
                    pwd: pwd
                },
                success: function(data) {
                    //console.log(data);
                    if (data.result === "success") {
                        // 로그인 성공 시 페이지 전환
                        
						//sessionStorage.setItem("user_id", data.user.uid ); // 저장
						//console.log(data.user);
                        window.location.href = "/main.do";
                    } else {
                        // 로그인 실패 시 경고 메시지 출력
                        alert(data.message);
                    }
                },
                error: function(xhr, status, error) {
                    // 오류 처리
                    alert("오류가 발생했습니다: " + error);
                }
            });
        }
    </script>
    
    <!-- Bootstrap core JavaScript-->
    <script src="/vendor/jquery/jquery.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/js/sb-admin-2.min.js"></script>

</body>

</html>