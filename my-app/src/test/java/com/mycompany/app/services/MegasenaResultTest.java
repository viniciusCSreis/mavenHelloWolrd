package com.mycompany.app.services;

import junit.framework.TestCase;

public class MegasenaResultTest extends TestCase {
    /** Número de dezenas esperadas no resultado da mega-sena. */
    private final static int NUMERO_DE_DEZENAS = 6;

    /**
     * Teste do método obtemUltimoResultado()
     */
    public void testObtemUltimoResultado()  {
        String[] ultimoResultado = MegasenaResult.obtemUltimoResultado();

        assertNotNull(ultimoResultado);
        assertTrue( ultimoResultado.length == NUMERO_DE_DEZENAS );
    }
}