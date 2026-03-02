using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrganizationMetadata
    {
        public int? SpMchId { get; set; }
        public int? PartnerId { get; set; }
        public int? AgentId { get; set; }
        public int? ShopId { get; set; }
    }
}
