package logicProjet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileExplorer {

	Path explorerPath;

	public FileExplorer(String path) {
		try {
		explorerPath = Paths.get(path);
		//Debug
		System.out.println(path + " cr?? avec succ?s");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public FileExplorer(String[] path) {
		StringBuilder sBuilder = new StringBuilder();
		/***
		for(String s : path) {
			sBuilder.append(s);
		}
		***/
		for(int ctr = 0; ctr < path.length; ctr++) {
			sBuilder.append(path[ctr]);
			if(ctr != (path.length - 1)) {
				sBuilder.append(" ");
			}
		}
		String filePath = sBuilder.toString();
		try {
		explorerPath = Paths.get(filePath);
		//Debug
		System.out.println(filePath + " cr?? avec succ?s");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void ExploreFiles() {
		List<Path> teehee = listFiles();
		teehee.forEach(x -> System.out.println(x));
	}

	public List<Path> listFiles() {
		List<Path> result = null;

		try (Stream<Path> walk = Files.walk(explorerPath)) {
			result = walk.filter(Files::isRegularFile).filter(p -> p.getFileName().toString().endsWith(".java"))
					.collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
		// https://www.baeldung.com/reading-file-in-java
	}

	public String ReadFromInputStream(InputStream inputStream) throws IOException {

		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		return resultStringBuilder.toString();
	}
}
