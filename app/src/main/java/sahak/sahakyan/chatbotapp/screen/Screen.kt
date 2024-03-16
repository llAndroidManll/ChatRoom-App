package sahak.sahakyan.chatbotapp.screen

sealed class Screen(
    val route: String,
) {
    data object LoginScreen : Screen("loginscreen")
    data object SignupScreen : Screen("signupscreen")
    data object ChatRoomsScreen : Screen("chatroomsrcreen")
    data object ChatScreen : Screen("chatscreen")
}