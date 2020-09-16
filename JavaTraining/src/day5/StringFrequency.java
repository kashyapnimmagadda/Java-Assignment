package day5;

public class StringFrequency {
	public  int[] frequency(String string)
	{
		int[] frequency = new int[string.length()];
		char[] charfrequency = string.toCharArray();
		for(int i=0;i<string.length();i++){
			frequency[i]=1;
			for(int j=i+1;j<string.length();j++){
				if(charfrequency[i]==charfrequency[j]){
					frequency[i]+=1;
					charfrequency[j]= '0';
				}
			}
		}
		return frequency;
	}
	public int charfrequency(String string,char charecter){
		int count = 0;
		
		char[] chararray= string.toCharArray();
		for(int i=0;i<chararray.length;i++){
			if(chararray[i]==charecter){
				count++;
			}
		}
		return count;
	}

}
