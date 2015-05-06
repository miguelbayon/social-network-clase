 import java.util.ArrayList;

public class Post
{
	private String username;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;
	
	/**
	 * Constructor de la clase Post
	 *
	 * @param author el nombre de usuario que crea el post
	 *
	 **/
	public Post(String author)
	{
		this.username = author;
		this.timestamp = System.currentTimeMillis();
		this.likes = 0;
		comments = new ArrayList<>();
	}

	/**
	 * Aumenta el contador de likes en uno
	 */
	 public void like()
	 {
	 	likes++;
	 }

	 /**
	  * Disminuye el contador de likes en uno. Si ya es cero no hace nada.
	  */
	  public void unlike()
	  {
	  	if(likes > 0)
	  	{
	  		likes--;
	  	}
	  }

	/**
	 * Agrega comentarios a los post publicados
	 * 
	 * @param text El comentario que agregar al post
 	 */
	public void addComment(String text){
		comments.add(text);
	}

	/**
	 * Devuelve el tiempo que ha pasado en milisegundos desde el 1 de enero
	 * de 1970 hasta que se creo el post
	 *
	 * @return el tiempo desde el 1 de enero de 1970 hasta que se creo el post.
	 */
	 public long getTimeStamp()
     {
		return timestamp;
     }

	/**
     	* Devuelve el tiempo en string
     	*
     	* @param tiempo actual en milisegundos.
     	* @return informacion en min y segundos del tiempo que ha transcurrido 
     	*          desde que subimos la foto hasta ahora.
     	*/
    	public String timeString(long time){
		    long diferencia = time - timestamp;
		    int segundos = (int)diferencia/1000;
		    int minutos = segundos/60;
		    int horas = minutos/60;
		    minutos -= horas*60;
		    segundos -= minutos*60;
		    
		    String tiempo = " ";
		    if(horas != 0)
		    {
		        tiempo += horas + " horas ";
		    }
		    if(minutos != 0)
		    {
		        tiempo += minutos + " minutos ";
		    }
		    tiempo += segundos + " segundos ";
		    return tiempo;        
    	}	
	
	public String getUsername()
	{
		return username;
	}
	
	
	
	public ArrayList<String> getComments()
	{
		return comments;
	}
		    
	public int getLikes(){
		return likes;
	}
	    
}















