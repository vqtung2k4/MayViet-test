<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<style>
/* ===== Reset ===== */
* { margin: 0; padding: 0; box-sizing: border-box; }
body {
  font-family: system-ui, -apple-system, "Segoe UI", Roboto, sans-serif;
  background: #f5f5f0;
  color: #4a4a40;
}

/* ===== Layout ===== */
.page {
  min-height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
  overflow: hidden;
}

/* ===== Background ===== */
.bg {
  position: absolute;
  inset: 0;
  opacity: 0.08;
}
.bg img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

/* ===== Card ===== */
.wrapper {
  position: relative;
  width: 100%;
  max-width: 420px;
  padding: 16px;
  z-index: 1;
}
.card {
  background: #fff;
  border-radius: 24px;
  padding: 32px;
  border: 1px solid #e8e8e0;
}
.shadow {
  position: absolute;
  inset: 0;
  background: #a8d5a0;
  opacity: 0.05;
  border-radius: 24px;
  transform: translate(8px, 8px);
  z-index: -1;
}

/* ===== Header ===== */
.header {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 8px;
  margin-bottom: 32px;
}
.header h1 {
  font-size: 24px;
  font-weight: 500;
  letter-spacing: .04em;
}
.leaf {
  width: 24px;
  height: 24px;
  color: #a8d5a0;
}

/* ===== Form ===== */
form { display: flex; flex-direction: column; gap: 20px; }
label {
  font-size: 14px;
  color: #6b6b60;
  letter-spacing: .04em;
}
input {
  padding: 12px 16px;
  border-radius: 16px;
  border: 1px solid #d8d8d0;
  background: #fafaf8;
  font-size: 15px;
}
input::placeholder { color: #b0b0a8; }
input:focus {
  outline: none;
  box-shadow: 0 0 0 2px #a8d5a0;
  border-color: transparent;
}

/* ===== Links ===== */
.forgot { text-align: right; }
.forgot a {
  font-size: 14px;
  color: #6b6b60;
  text-decoration: none;
}
.forgot a:hover { color: #a8d5a0; }

/* ===== Button ===== */
button {
  padding: 12px;
  border-radius: 16px;
  border: none;
  background: #a8d5a0;
  color: #fff;
  font-size: 15px;
  cursor: pointer;
}
button:hover { background: #95c78a; }
button:active { background: #85b77a; }

/* ===== Signup ===== */
.signup {
  margin-top: 24px;
  text-align: center;
  font-size: 14px;
  color: #6b6b60;
}
.signup a {
  color: #a8d5a0;
  font-weight: 500;
  text-decoration: none;
}

/* ===== Decoration ===== */
.footer {
  margin-top: 32px;
  padding-top: 24px;
  border-top: 1px solid #e8e8e0;
  display: flex;
  justify-content: center;
  gap: 6px;
  opacity: .2;
}
.bamboo {
  width: 4px;
  height: 16px;
  background: #a8d5a0;
  border-radius: 4px;
}
.bamboo.tall { height: 24px; }
</style>
</head>

<body>
<div class="page">

  <!-- Background -->
  <div class="bg">
    <img src="https://images.unsplash.com/photo-1764516521329-8a232577d2a0?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&q=80&w=1080">
  </div>

  <!-- Card -->
  <div class="wrapper">
    <div class="card">

      <!-- Header -->
      <div class="header">
        <svg class="leaf" viewBox="0 0 24 24" fill="none">
          <path d="M5 21C5 14 19 14 19 3"
                stroke="currentColor" stroke-width="1.5"/>
        </svg>
        <h1>Login</h1>
      </div>

      <!-- Form -->
      <form action="${pageContext.request.contextPath}/login" method="post">
        <div>
          <label>Username</label>
          <input type="text" name="username" placeholder="Enter your username" required>
        </div>

        <div>
          <label>Password</label>
          <input type="password" name="password" placeholder="Enter your password" required>
        </div>

        <div class="forgot">
          <a href="#">Forgot password?</a>
        </div>

        <button type="submit">Login</button>
      </form>

      <!-- Signup -->
      <div class="signup">
        Do not have an account?
        <a href="#">Sign up now!</a>
      </div>

      <!-- Decoration -->
      <div class="footer">
        <div class="bamboo"></div>
        <div class="bamboo tall"></div>
        <div class="bamboo"></div>
        <div class="bamboo tall"></div>
        <div class="bamboo"></div>
      </div>

    </div>
    <div class="shadow"></div>
  </div>

</div>
</body>
</html>
