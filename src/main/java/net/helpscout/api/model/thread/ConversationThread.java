package net.helpscout.api.model.thread;

import net.helpscout.api.cbo.ActionType;
import net.helpscout.api.cbo.Status;
import net.helpscout.api.cbo.ThreadState;
import net.helpscout.api.cbo.ThreadType;
import net.helpscout.api.model.Attachment;
import net.helpscout.api.model.MailboxUser;
import net.helpscout.api.model.ref.MailboxRef;
import net.helpscout.api.model.ref.MailboxUserRef;
import net.helpscout.api.model.ref.PersonRef;
import net.helpscout.api.model.ref.UserRef;

import java.util.Date;
import java.util.List;

public interface ConversationThread {
    
    Long getId();
    boolean isPublished();
    boolean isDraft();
    boolean isHeldForReview();
    boolean hasAttachments();
    ThreadType getType();
    ThreadState getState();
    String getBody();
    List<String> getTo();
    List<String> getCc();
    List<String> getBcc();
    List<Attachment> getAttachments();
    boolean isAssigned();
    boolean isActive();
    boolean isPending();
    boolean isClosed();
    boolean isSpam();
    boolean isStatusChange();
    MailboxUserRef getAssignedTo();
    Status getStatus();
    PersonRef getCreatedBy();
    Date getCreatedAt();
    MailboxRef getFromMailbox();
    ActionType getActionType();
    Long getActionSourceId();
    void setId(Long id);
    void setType(ThreadType type);
    void setState(ThreadState state);
    void setStatus(Status status);
    void setBody(String body);
    void setTo(List<String> to);
    void setCc(List<String> cc);
    void setBcc(List<String> bcc);
    void setAttachments(List<Attachment> attachments);
    void setAssignedTo(MailboxUserRef assignedTo);
    void setCreatedBy(PersonRef person);
    void setCreatedAt(Date createdAt);
}