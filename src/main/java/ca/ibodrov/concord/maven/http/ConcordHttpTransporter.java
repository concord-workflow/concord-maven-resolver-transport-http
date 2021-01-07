package ca.ibodrov.concord.maven.http;

import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.transfer.NoTransporterException;
import org.eclipse.aether.transport.http.HttpTransporter;

public class ConcordHttpTransporter extends HttpTransporter {

    public ConcordHttpTransporter(RemoteRepository repository, RepositorySystemSession session) throws NoTransporterException {
        super(repository, session);
    }


}
