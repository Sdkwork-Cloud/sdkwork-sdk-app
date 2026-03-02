using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentBatchUpdateRequest
    {
        public List<DocumentBatchOperationRequest>? Requests { get; set; }
        public bool? Strict { get; set; }
    }
}
