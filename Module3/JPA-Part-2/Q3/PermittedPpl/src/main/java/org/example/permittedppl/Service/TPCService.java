package org.example.permittedppl.Service;



import org.example.permittedppl.Repo.TPCAudienceRepo;
import org.example.permittedppl.Repo.TPCPerformerRepo;
import org.example.permittedppl.TablePerClassEnity.TPCAudience;
import org.example.permittedppl.TablePerClassEnity.TPCPerformer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPCService {

    private final TPCPerformerRepo tpcPerformerRepo;
    private final TPCAudienceRepo tpcAudienceRepo;

    public TPCService(TPCPerformerRepo tpcPerformerRepo, TPCAudienceRepo tpcAudienceRepo) {
        this.tpcPerformerRepo = tpcPerformerRepo;
        this.tpcAudienceRepo = tpcAudienceRepo;
    }


    public TPCPerformer savePerformer(TPCPerformer performer) {
        return tpcPerformerRepo.save(performer);
    }

    public TPCAudience saveAudience(TPCAudience audience) {
        return tpcAudienceRepo.save(audience);
    }

    public List<TPCPerformer> getAllPerformers() {
        return tpcPerformerRepo.findAll();
    }

    public List<TPCAudience> getAllAudience() {
        return tpcAudienceRepo.findAll();
    }
}
