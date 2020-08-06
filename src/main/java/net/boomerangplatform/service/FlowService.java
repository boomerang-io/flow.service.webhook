package net.boomerangplatform.service;

import net.boomerangplatform.model.EventPayload;
import net.boomerangplatform.model.FlowActivity;
import net.boomerangplatform.model.FlowWebhookResponse;
import net.boomerangplatform.model.RequestFlowExecution;

public interface FlowService {
  public FlowActivity getFlowActivity(String request, String activityId);

  public FlowWebhookResponse submitWebhookEvent(RequestFlowExecution request);

  public void submitListenerEvent(String topic, EventPayload eventPayload);

  public FlowActivity getFlowActivityViaProperty(String token, String key, String token2);
}
