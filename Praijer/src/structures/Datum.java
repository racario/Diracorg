package structures;
public class Datum
{
    private final int jaar;
    private final int maand;
    private final int dag;

    private static final int JANUARI = 1;
    private static final int FEBRUARI = 2;
    private static final int MAART = 3;
    private static final int APRIL = 4;
    private static final int MEI = 5;
    private static final int JUNI = 6;
    private static final int JULI = 7;
    private static final int AUGUSTUS = 8;
    private static final int SEPTEMBER = 9;
    private static final int OKTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    public Datum( int dag, int maand, int jaar )
    {
        if ( isGeldigeDatum( dag, maand, jaar ) )
        {
            this.dag = dag;
            this.maand = maand;
            this.jaar = jaar;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    public int getDag()
    {
        return dag;
    }

    public int getMaand()
    {
        return maand;
    }

    public int getJaar()
    {
        return jaar;
    }

    private static boolean deelbaarDoor(int x, int y)
    {
        return x % y == 0;
    }

    private static boolean isSchrikkeljaar(int jaar)
    {
        if ( !deelbaarDoor( jaar, 4 ) )
        {
            return false;
        }
        else if ( !deelbaarDoor( jaar, 100 ) )
        {
            return true;
        }
        else if ( !deelbaarDoor( jaar, 400 ) )
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private static int aantalDagenInMaand(int maand, int jaar)
    {
        switch ( maand )
        {
        case JANUARI:
        case MAART:
        case MEI:
        case JULI:
        case AUGUSTUS:
        case OKTOBER:
        case DECEMBER:
            return 31;

        case FEBRUARI:
            return isSchrikkeljaar( jaar ) ? 29 : 28;

        case APRIL:
        case JUNI:
        case SEPTEMBER:
        case NOVEMBER:
            return 30;

        default:
            throw new IllegalArgumentException();
        }
    }

    private boolean isGeldigeDatum(int dag, int maand, int jaar)
    {
        return isGeldigeMaand( maand ) && isGeldigeDag( dag, maand, jaar );
    }

    private boolean isGeldigeMaand(int maand)
    {
        return JANUARI <= maand && maand <= DECEMBER;
    }

    private boolean isGeldigeDag(int dag, int maand, int jaar)
    {
        return 1 <= dag && dag <= aantalDagenInMaand( maand, jaar );
    }

    public String format()
    {
        return String.format( "%d/%d/%d", dag, maand, jaar );
    }
    
    private int dagIndex()
    {
        return dag + 40 * maand + 500 * jaar;
    }
    
    public boolean isGelijkAan(Datum datum)
    {
        if ( datum == null )
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return this.dagIndex() == datum.dagIndex();
        }
    }
    
    public boolean isEerderDan(Datum datum)
    {
        if ( datum == null )
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return this.dagIndex() < datum.dagIndex();
        }
    }
    
    public boolean isLaterDan(Datum datum)
    {
        if ( datum == null )
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return this.dagIndex() > datum.dagIndex();
        }
    }
}
