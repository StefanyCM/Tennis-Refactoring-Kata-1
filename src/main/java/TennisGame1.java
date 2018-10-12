
public class TennisGame1 implements TennisGame {
    
    private int marcador_puntaje1 = 0;
    private int marcador_puntaje2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;
    String puntajeResultado = "";

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }
    
    
    

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1") {
            marcador_puntaje1 += 1;
        }else {
            marcador_puntaje2 += 1;
        }
    }

    
    public void verificarEmpate() {
            switch (marcador_puntaje1)
            {
                case 0:
                	puntajeResultado = "Amor-Todos";
                    break;
                case 1:
                	puntajeResultado = "Quince-Todos";
                    break;
                case 2:
                	puntajeResultado = "Treinta-Todos";
                    break;
                default:
                	puntajeResultado = "Deuce";
                    break;
            }
    }
    
    
    public void diferenciaPuntajes() {
    	int diferencia = marcador_puntaje1 - marcador_puntaje2;
    	
    	if (diferencia==1) {
    		puntajeResultado ="Ventaja jugador1";
    	}
        else if(diferencia ==-1) {
        	puntajeResultado ="Ventaja jugador2";
        }else if (diferencia>=2) {
        	puntajeResultado = "Gana jugador1";
        }
        else {
        	puntajeResultado ="Gana jugador2";
        }
    }
 
    public void puntajeRonda() {
    	int Puntaje_temporal;
    	for (int i=1; i<3; i++)
        {
            if (i==1) {
            	Puntaje_temporal = marcador_puntaje1;
            }else {
            	puntajeResultado+="-"; 
            	Puntaje_temporal = marcador_puntaje2;
            }
           puntajeTemporal(Puntaje_temporal);
        }
    }
    
    public void puntajeTemporal (int Puntaje_temporal){
    	
    	 switch(Puntaje_temporal)
         {
             case 0:
             	puntajeResultado+="Amor";
                 break;
             case 1:
             	puntajeResultado+="Quince";
                 break;
             case 2:
             	puntajeResultado+="Treinta";
                 break;
             case 3:
             	puntajeResultado+="Cuarenta";
                 break;
         }
    }
    
    public String getPuntaje() {
        
        if (marcador_puntaje1 == marcador_puntaje2){
        	verificarEmpate();
        }       
        else if (marcador_puntaje1 >=4 || marcador_puntaje2 >=4)
        {
            diferenciaPuntajes();            
        }
        else {
            puntajeRonda();
        }
        return puntajeResultado;
    }
}
