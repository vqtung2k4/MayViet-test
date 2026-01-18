<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>

    <style>
        * {
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            margin: 0;
            min-height: 100vh;
            background: #f5f3ed;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 16px;
        }

        /* Sign up card */
        .card {
            width: 100%;
            max-width: 420px;
            background: #ffffff;
            border-radius: 24px;
            padding: 32px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        /* Logo upload area */
        .logo-upload {
            width: 128px;
            height: 128px;
            margin: 0 auto 24px;
            border: 2px dashed #88b388;
            border-radius: 20px;
            background: #f0f7f0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            gap: 8px;
            text-align: center;
        }

        .logo-upload span {
            font-size: 12px;
            color: #88b388;
        }

        /* Title */
        h1 {
            text-align: center;
            font-size: 28px;
            color: #4a5d4a;
            margin-bottom: 32px;
        }

        /* Form */
        .form-group {
            margin-bottom: 18px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-size: 14px;
            color: #4a5d4a;
        }

        input {
            width: 100%;
            padding: 12px 14px;
            border-radius: 10px;
            border: 1px solid #d4dcd4;
            font-size: 14px;
            outline: none;
        }

        input:focus {
            border-color: #88b388;
            box-shadow: 0 0 0 3px rgba(136, 179, 136, 0.2);
        }

        /* Button */
        button {
            width: 100%;
            padding: 14px;
            border-radius: 10px;
            border: none;
            background: #88b388;
            color: white;
            font-size: 15px;
            cursor: pointer;
            margin-top: 12px;
        }

        button:hover {
            background: #6fa06f;
        }

        button:active {
            background: #5a8a5a;
        }

        /* Login link */
        .login-link {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #6b7d6b;
        }

        .login-link a {
            color: #88b388;
            text-decoration: none;
        }

        .login-link a:hover {
            text-decoration: underline;
            color: #6fa06f;
        }
    </style>
</head>
<body>

<div class="card">

    <!-- Logo upload UI (chỉ giao diện) -->
    <div class="logo-upload">
        <span>Upload logo</span>
        <input type="file" name="logo" style="font-size:12px;">
    </div>

    <h1>Sign Up</h1>

    <form action="signup" method="post" enctype="multipart/form-data">

        <div class="form-group">
            <label>Full Name</label>
            <input type="text" name="fullname" placeholder="Enter your full name">
        </div>

        <div class="form-group">
            <label>Username</label>
            <input type="text" name="username" placeholder="Choose a username">
        </div>

        <div class="form-group">
            <label>Phone</label>
            <input type="tel" name="phone" placeholder="Enter your phone number">
        </div>

        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" placeholder="Enter your email">
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" placeholder="Create a password">
        </div>

        <div class="form-group">
            <label>Confirm Password</label>
            <input type="password" name="confirmPassword" placeholder="Re-enter your password">
        </div>

        <button type="submit">Sign Up</button>
    </form>

    <div class="login-link">
        Already have an account?
        <a href="login.jsp">Login</a>
    </div>

</div>

</body>
</html>
