using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteBatchUpdateRequest
    {
        public List<NoteBatchOperationRequest>? Requests { get; set; }
        public bool? Strict { get; set; }
    }
}
