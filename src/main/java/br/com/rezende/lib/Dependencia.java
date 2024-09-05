package br.com.rezende.lib;

import ie.stu.papercut.Milestone;
import ie.stu.papercut.Refactor;
import ie.stu.papercut.RemoveThis;

public class Dependencia {
    @Milestone("LOGIN_REDESIGN")
    public static final String REFATORAR = "REFATORAR";

    @Refactor(value = "Lazy implementation", date = "2024-09-01")
    public void dependencia() {
        System.out.println("Dependencia");
    }

    @RemoveThis(value = "Horrible hack", date = "2024-09-01")
    public void testeComData() {}

    @RemoveThis(value = "Horrible hack", versionName = "1.0.1")
    public void testeComVersao() {}

    @Refactor(
            value = "Use new API",
            milestone = REFATORAR
    )
    public void testeComMilestone() {}
}
