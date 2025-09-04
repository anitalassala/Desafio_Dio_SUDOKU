package Package.model;

public enum Status_Jogo {
    NÃOINICIADO("não iniciado"),
    INCOMPLETO ("incompleto"),
    COMPLETO("completo");

    private String label;

    Status_Jogo (final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
}
