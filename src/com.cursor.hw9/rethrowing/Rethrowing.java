package com.cursor.hw9.rethrowing;

class Rethrowing {
    void firstMethod() throws Exception {
        secondMethod();
    }

    private void secondMethod() throws Exception {
        throw new Exception();
    }
}
