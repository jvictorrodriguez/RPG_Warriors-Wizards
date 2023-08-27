package org.example.RPG_game.service;



public class Console {

    public static void main(String[] args) {
        System.out.println("...Starting new GameService.............");
        GameService gameService= new GameService();

        System.out.println(warriorsWizards());
//        System.out.println(selectLanguage());


        gameService.setGame();
    }

    public static String warriorsWizards(){

        String warrior= """
                            
                __          __             _                \s
                \\ \\        / /            (_)               \s
                 \\ \\  /\\  / /_ _ _ __ _ __ _  ___  _ __ ___ \s
                  \\ \\/  \\/ / _` | '__| '__| |/ _ \\| '__/ __|\s
                   \\  /\\  / (_| | |  | |  | | (_) | |  \\__ \\\s
                    \\/  \\/ \\__,_|_|  |_|  |_|\\___/|_|  |___/\s
                  ___                                       \s
                 ( _ )                                      \s
                 / _ \\/\\                                    \s
                | (_>  <                                    \s
                 \\___/\\/                                    \s
                 __          ___                  _         \s
                 \\ \\        / (_)                | |        \s
                  \\ \\  /\\  / / _ ______ _ _ __ __| |___     \s
                   \\ \\/  \\/ / | |_  / _` | '__/ _` / __|    \s
                    \\  /\\  /  | |/ / (_| | | | (_| \\__ \\    \s
                     \\/  \\/   |_/___\\__,_|_|  \\__,_|___/    \s
                                                            \s
                                                            \s
                            
                """.formatted();

return warrior;
    }

    public static String selectLanguage(){
        return """
                                
                          _           _     _                                         \s
                 ___  ___| | ___  ___| |_  | | __ _ _ __   __ _ _   _  __ _  __ _  ___\s
                / __|/ _ \\ |/ _ \\/ __| __| | |/ _` | '_ \\ / _` | | | |/ _` |/ _` |/ _ \\
                \\__ \\  __/ |  __/ (__| |_  | | (_| | | | | (_| | |_| | (_| | (_| |  __/
                |___/\\___|_|\\___|\\___|\\__| |_|\\__,_|_| |_|\\__, |\\__,_|\\__,_|\\__, |\\___|
                                                          |___/             |___/     \s
                                
                """.formatted();
    }
}
