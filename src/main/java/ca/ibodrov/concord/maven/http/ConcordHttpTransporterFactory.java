package ca.ibodrov.concord.maven.http;

import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.spi.connector.transport.Transporter;
import org.eclipse.aether.transfer.NoTransporterException;
import org.eclipse.aether.transport.http.HttpTransporterFactory;

public class ConcordHttpTransporterFactory extends HttpTransporterFactory {

    @Override
    public Transporter newInstance(RepositorySystemSession session, RemoteRepository repository) throws NoTransporterException {
        return new ConcordHttpTransporter(repository, session);
    }
}
