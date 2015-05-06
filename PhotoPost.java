import java.util.ArrayList;

public class PhotoPost extends Post
{
	private String filename;
	private String caption;

	/**
	 * Constructor de la clase PhotoPost
	 *
	 * @param filename el nombre del archivo de la foto
	 * @param caption el título asociado a la foto
	 *
	 **/
	public PhotoPost(String author, String filename, String caption)
	{
		super(author);
		this.filename = filename;
		this.caption = caption;
	}

	/**
	 * Devuelve el nombre del archivo de la imagen
	 *
	 * @return filename el nombre del archivo de imagen del post
	 **/
	public String getImageFilename()
	{
		return filename;
	}

	/**
	 * Devuelve el titulo asociado a la imagen
	 * 
	 * @return caption el título asociado a la imagen
	 **/
	 public String getCaption()
	 {
	 	return caption;
	 }

	/*
	* Muestra por pantalla los datos del post
	*
	*/
	public void display()
	{
		System.out.println("Autor del mensaje " + getUsername());
		System.out.println("Nombre de la foto " + filename);
		System.out.println("Titulo de la foto " + caption);
		System.out.println("Me gusta " + getLikes());
		System.out.println(timeString(System.currentTimeMillis()));
		if(getComments().size() <=0)
		{
			System.out.println( "No hay comentarios aun para este post");
		}
		else
		{		   			   
	         for( String comment : getComments())
	         {
			System.out.println(comment);
	         }
	        }
	}
}












